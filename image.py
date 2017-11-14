from scipy import misc
import matplotlib.pyplot as plt
import Image
face=misc.imread('img.png')


plt.imshow(face)
plt.show()

im=Image.open('img.png')
pixels=list(im.getdata())
