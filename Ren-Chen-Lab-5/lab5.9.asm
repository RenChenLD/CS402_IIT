			.data 0x10000000
			.align 0
char1:      .byte 'a'		# reserve space for a byte
double1:    .double 1.1		# reserve space for a double
char2:      .byte 'b'		# b is 0x62 in ASCII
half1:      .half 0x8001	# reserve space for a half-word (2 bytes)
char3:      .byte 'c'		# c is 0x63 in ASCII
word1:      .word 0x56789abc  # reserve space for a word
char4:      .byte 'd'         # d is 0x64 in ASCII
			.text
            .globl main
main:       la $s0, word1
			lwl $t0, 0($s0)
			lwl $t1, 1($s0)
			lwl $t2, 2($s0)
			lwl $t3, 3($s0)
			lwr $t4, 0($s0)
			lwr $t5, 1($s0)
			lwr $t6, 2($s0)
			lwr $t7, 3($s0)
			jr $ra            # return from main