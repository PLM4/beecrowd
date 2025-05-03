p = input().split()
p1 = input().split()

a = int(p[0])
b = int(p[1])
c = float(p[2])

d = int(p1[0])
e = int(p1[1])
f = float(p1[2])

kd = (b*c + e*f)

print("VALOR A PAGAR: R$ %.2f" % kd)