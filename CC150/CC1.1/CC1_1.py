import string
import random

def idGen(size=5, chars = string.ascii_lowercase+string.digits):
	return ''.join(random.choice(chars) for _ in	range(size))

randomString = idGen()
print randomString



class solution:
	def UniString(self, string):
		if string == ' ':
			return true

		string = sorted(string)
		print string
		prev = string[0]
		for char in string[1:]:
			if char == prev:
				return False
			prev = char
		
		return True		


if solution.UniString(randomString) == True:
	print 'true'
else:
	print 'flase'
