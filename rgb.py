import xlwt

count = 0
wb=xlwt.Workbook()
ws = wb.add_sheet("sheet 1")

for x in range(0,256):
	for y in range(0,256):
		for z in range(0,256):
			#g=str(x)+","+str(y)+","+str(z)
			ws.write(count,0,x)
			ws.write(count,1,y)
			ws.write(count,2,z)
			count = count +1

		wb.save("rgb.xls")
