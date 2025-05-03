cont = None
oMaior = None

for i in range(100):
  x = int(input())
  if oMaior == None or x > oMaior:
    oMaior = x
    cont = i+1
  
  
print(oMaior)
print(cont)