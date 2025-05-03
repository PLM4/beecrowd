# -----Resolução da questão 1019 do beecrowd----- #

n = int(input())

h = n // 3600
n = n % 3600
min = n // 60
n = n % 60
seg = n

print(h , ":" , min , ":" , seg, sep="")
