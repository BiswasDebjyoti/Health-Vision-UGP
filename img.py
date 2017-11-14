from PIL import Image
import pickle
im=Image.open('rsz_img.png')

pixels=list(im.getdata())

place=[(0,0,0)]*40937
count=0
for i in range(0,42984):
	pix=pixels[i]
	if (pix[0]>49 or pix[1]>49 or pix[2]>49):
		place[count]=pix
		count=count+1		


with open('values.pickle','wb') as foo:
	pickle.dump(pixels,foo)








#pix=pixels[0]

#sum=pix[0]+pix[1]+pix[2]

#print sum

#for si in len(pixels):
	
