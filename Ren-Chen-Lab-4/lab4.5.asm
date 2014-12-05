			.text
			.globl main
main:	 	
			jal Input
			jal Factorial
			
			jr $ra			 # return from main
# The procedure ‘test’ does not call any other procedure. Therefore $ra
# does not need to be saved. Since ‘test’ uses no registers there is
# no need to save any registers.
Input:		
			li $v0, 4
			la $a0, input
			syscall
			li $v0, 5
			syscall
			move $t0, $v0
			slti $t1, $t0, 0
			bne $t1, $0, Input

Factorial:	subu $sp, $sp, 4
			sw $ra, 4($sp)		# save the return address on stack
			beqz $t0, terminate	# test for termination
			subu $sp, $sp, 4	# do not terminate yet
			sw $t0, 4($sp)		# save the parameter
			sub $t0, $t0, 1		# will call with a smaller argument
			jal Factorial

# after the termination condition is reached these lines
# will be executed
			lw $t0, 4($sp)		# the argument I have saved on stack
			mul $v0, $v0, $t0	# do the multiplication
			lw $ra, 8($sp)		# prepare to return
			add $sp, $sp, 8	# I’ve popped 2 words (an address and 
			jr $ra				# .. an argument)
			

terminate:
			li $v0, 1			# 0! = 1 is the return value
			lw $ra, 4($sp)		# get the return address
			add $sp, $sp, 4	# adjust the stack pointer
			jr $ra 				# return

		.data
input:	.asciiz "Please input the integer"






