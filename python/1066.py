cont = 0
conta = 0
contado = 0
contador = 0

for c in range(5):
  n = int(input())
  if n % 2 == 0:
    cont +=1
  elif n % 2 != 0:
    conta += 1
  if n > 0:
    contado += 1
  elif n < 0:
    contador += 1 

print(cont , "valor(es) par(es)" )
print(conta , "valor(es) impar(es)") 
print(contado , "valor(es) positivo(s)")
print(contador , "valor(es) negativo(s)")