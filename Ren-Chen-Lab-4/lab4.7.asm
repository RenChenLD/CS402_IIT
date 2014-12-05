		.data
input:	.asciiz "Please input the first non-negative integer:"
input2:	.asciiz "Please input the second non-negative integer:"
outputr: .asciiz "Result:"
		
		.text
		.globl main
main:	li $v0, 4
		la $a0, input
		syscall
		li $v0, 5
		syscall
		move $t0, $v0
		li $v0, 4
		la $a0, input2
		syscall
		li $v0, 5
		syscall
		move $t1, $v0
		jr $ra

Ackermann:	beqz $t0, output0
			beqz $t1, output1
			addi $t1, $t1, -1
			jal Ackermann



output0:	addiu $t3, $t2, 1
			li $v0, 4
			la $a0, outputr
			syscall
			li $v0, 1
			move $a0, $t2
			syscall
			jr $ra

output1:	addi $t0, $t0,-1
			li $t1, 1
			jal Ackermann
