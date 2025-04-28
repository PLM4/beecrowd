t = 0
n = 0

for c in range(6):
  a = float(input())
  
  if a > 0:
    t = t + 1
    n = n + a

m = n/t
print(t , "valores positivos")
print("%.1f" % m)