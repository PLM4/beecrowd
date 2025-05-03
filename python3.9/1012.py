# -----Resolução da questão 1012 do beecrowd----- #

pi = (3.14159)
a, b, c = input().split()
a = float(a)
b = float(b)
c = float(c)

triangulo = (a*c)/2
circulo = pi*c**2
trapezio = ((a+b)*c)/2
quadrado = b**2
retangulo = a*b

print("TRIANGULO: %.3f" % triangulo)
print("CIRCULO: %.3f" % circulo)
print("TRAPEZIO: %.3f" % trapezio)
print("QUADRADO: %.3f" % quadrado)
print("RETANGULO: %.3f" % retangulo)
