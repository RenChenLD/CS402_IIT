		.data 0x10000000
msg1:       .asciiz "Please enter an integer number: "
msg2:		.asciiz "I'm far away."
msg3:		.asciiz "I'm nearby."
			.text
			.globl main

main:	addu $s0, $ra, $0
            li $v0, 4
            la $a0, msg1
            syscall
# now get an integer from the user
            li $v0, 5
# save $31 in $16
# system call for print_str
# address of string to print
# system call for read_int
# the integer placed in $v0
            syscall
            move $t1, $v0
            li $v0, 4
            la $a0, msg1
            syscall
            li $v0, 5
            syscall
            move $t2, $v0
            beq $t1, $t2, Far
            bne $t1, $t2, Nearby
            addu $ra, $s0, $0
            jr $ra

Far:		li $v0, 4
			la $a0, msg2
			syscall
			j Exit

Nearby:		li $v0, 4
			la $a0, msg3
			syscall
			j Exit

Exit:		li $v0, 10
			syscall