			.data 0x10000000 
user1:		.word 0x0
user2:		.word 0x0
mess:		.asciiz "If bytes were layed in reverse order the number would be: "
mess2:		.asciiz "Please input an integer: "

			.text
			.globl main
main:	 	add $sp, $sp, -4 # must save $ra since I’ll have a call
			sw $ra, 4($sp)
			li $v0, 4
			la $a0, mess2
			syscall
			li $v0, 5
			syscall
			sw $v0, user1
			jal Reverse_bytes 		 # call 'Reserve_bytes' with no 
									# parameters
			lw $ra, 4($sp)	 # restore the return address in $ra
			add $sp, $sp, 4
			jr $ra			 # return from main
# The procedure ‘test’ does not call any other procedure. Therefore $ra
# does not need to be saved. Since ‘test’ uses no registers there is
# no need to save any registers.
Reverse_bytes:		la $s0, user1
					lb $t0, 0($s0)		
					lb $t1, 1($s0)
					lb $t2, 2($s0)
					lb $t3, 3($s0)
					la $s1, user2
					sb $t3, 0($s1)
					sb $t2, 1($s1)
					sb $t1, 2($s1)
					sb $t0, 3($s1)
					li $v0, 4
					la $a0, mess
					syscall
					li $v0, 1
					lw $a0, user2
					syscall			 	 
					jr $ra			 # return from this procedure