# -----Resolução da questão 1013 do beecrowd----- #

a, b, c = input().split()
a = int(a)
b = int(b)
c = int(c)

resultado = (a+b+abs(a-b))//2
resultadoa = (resultado+c+abs(resultado-c))//2

print(resultadoa , "eh o maior")