		.data 0x10010000
var1:	.word 0x3a
var2:	.word 0x7b
var3:	.word 0x9c
var4:	.word 0x1d
first:	.word r
last:	.word c


		.text
		.globl main
main:
		la $t0, var1		#load the address of var1
		lw $t1, 0($t0)		#load the data of var1
		la $t2, var4		#load the address of var4
		lw $t3, 0($t2)		#load the data of var4
		xor $t1, $t1, $t3	#exchange the data of var1 and var4
		xor $t3, $t1, $t3
		xor $t1, $t1, $t3
		sw $t1, 0($t0)		#store data in location of var1
		sw $t3, 0($t2)		#store data in location of var4
		la $t0, var2
		lw $t1, 0($t0)
		la $t2, var3
		lw $t3, 0($t2)
		xor $t1, $t1, $t3
		xor $t3, $t1, $t3
		xor $t1, $t1, $t3
		sw $t1, 0($t0)
		sw $t3, 0($t2)
		
		jr $ra


		