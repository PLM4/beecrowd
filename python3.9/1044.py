m, m1 = input().split()
m = int(m)
m1 = int(m1)

if m1 % m == 0 or m % m1 == 0: 
    print("Sao Multiplos")
else: 
    print("Nao sao Multiplos")