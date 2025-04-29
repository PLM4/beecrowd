n = int(input())
x = int(input())
soma = 0

if x < n:
  aux = x 
  x = n 
  n = aux

for c in range(n + 1, x):
  if c % 2 == 0:
     continue
  soma += c 

print(soma)