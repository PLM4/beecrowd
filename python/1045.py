a, b, c = input().split()
a = float(a)
b = float(b)
c = float(c)

if a < b and b > c:
  aux  = b
  b = a
  a = aux
elif a < c and c > b:
  aux  = c
  c = a
  a = aux
if a >= (b+c): 
  print("NAO FORMA TRIANGULO")
elif a**2 > (b**2 + c**2):
  print("TRIANGULO OBTUSANGULO")
if a**2 == (b**2 + c**2): 
  print("TRIANGULO RETANGULO")
if a**2 < (b**2 + c**2):
  print("TRIANGULO ACUTANGULO")
if a == b and a == c and c == b:
  print("TRIANGULO EQUILATERO")
else:
    if a == b or a == c or b == c:
      print("TRIANGULO ISOSCELES")
    
    
