

def testPermutation(string1, string2):
	if len(string1)!= len(string2):
		return False

	dict1 = dict()
	for char in string1:
		if dict1.has_key(char) == True:
			dict1[char] += 1
		else:
			dict1.update({char:1})	

	dict2 = dict()	
	for char in string2:
		if dict2.has_key(char) == True:
			dict2[char] += 1
		else:
			dict2.update({char:1})	

	print dict1
	print dict2
	
	#compare returns num values:
	#-1 less than, 0 equal, 1 great
	if cmp(dict1,dict2)==0:
		return True
	else:
		return False

string1 = 'dogg'
string2 = 'ggod'
print 'test permuation:',testPermutation(string1, string1)
