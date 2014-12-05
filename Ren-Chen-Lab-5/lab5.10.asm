				.data 0x10000000
ch1:			.byte 'a'
word1:			.word 0x89abcdef
ch2:			.byte 'b'
word2:			.word 0x0

				.text
				.globl main
main:			la $s0, word1
				la $s1, word2
				lwl $t0, 3($s0)
				sw $t0, 0($s1)
				jr $ra