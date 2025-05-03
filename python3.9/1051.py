a = float(input())

if a > 0 and a <= 2000.00:
  print("Isento")
elif a >= 2000.01 and a <= 3000.00:
  a = a - 2000
  i = 0.08 * a
  print("R$ %.2f" % i)
elif a >= 3000.01 and a <= 4500.00:
  a = a - 3000
  i = 0.18 * a
  i = (1000 * 0.08) + i
  print("R$ %.2f" % i)
elif a > 4500.00: 
  a = a - 4500
  i = 0.28 * a 
  i = (1500 * 0.18) + i
  i = (1000 * 0.08) + i 
  print("R$ %.2f" % i)