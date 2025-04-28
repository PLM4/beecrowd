# -----Resolução da questão 1018 do beecrowd----- #

x = int(input())
vals = [100, 50, 20, 10, 5, 2, 1]

print(x)

for valor in vals:
  n = x // valor
  print(f'{n} nota(s) de R$ {valor},00')
  x = x % valor