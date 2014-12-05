			.data 0x10010000
var1:		.word 0x2
var2:		.word 0x3
			.extern ext1 4
			.extern ext2 4
	
			.text
			.globl main
main:		
			la $t0, ext2
			lw $t1, var1
			sw $t1, 0($t0)
			add $t0, $t0, $t1
			sw $t0, ext2

			lw $t0, var2
			la $t1, ext1
			sw $t0, 0($t1)
			add $t1, $t0, $t1
			sw $t1, ext1

			la $s0, var1
			la $s1, var2
			la $s2, ext1
			la $s3, ext2

			li $v0, 10
			syscall


		