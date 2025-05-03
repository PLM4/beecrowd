cont = 0
a = 0
while cont < 2:
  x = float(input())
  if  0 <= x <=10:
    cont += 1
    a += x
  else:
    print("nota invalida")

media = a/2

print("media = %.2f" % media)