			.text
			.globl main
main:	 	add $sp, $sp, -4 # must save $ra since I’ll have a call
			sw $ra, 4($sp)
			li $v0, 4
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
			jal Largest 		 # call ‘Largest’ with two parameters
			li $v0, 10
			syscall
# The procedure ‘test’ does not call any other procedure. Therefore $ra
# does not need to be saved. Since ‘test’ uses no registers there is
# no need to save any registers.
Largest:	bge $t1, $t0, L1 
			move $t1, $t0 		# largest number in $t1 
			bge $t2, $t1, L1 
			move $t2, $t1
			jr $ra			 # return from this procedure

L1:			li $v0, 4
			la $a0, answer
			syscall

			li $v0, 1
			move $a0, $t1
			syscall

			.data
answer:	.asciiz "The largest integer is"
input:	.asciiz "Please input the first integer"
input2:	.asciiz "Please input the second integer"
