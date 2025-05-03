n = int(input())
anterior= 0
corrente = 1
fib = f"{anterior} {corrente}"

for i in range(n-2):
  proximo = anterior + corrente
  anterior = corrente 
  corrente = proximo 

  fib += f" {corrente}"

print(fib)
