a = float(input())

if a > 0 and a <= 400.00:
  y = 0.15 * a
  a = y + a
  print("Novo salario: %.2f" % a)
  print("Reajuste ganho: %.2f" % y)
  print("Em percentual: 15 %")
elif a >= 400.01 and a <= 800.00:
  y = 0.12 * a
  a = y + a
  print("Novo salario: %.2f" % a)
  print("Reajuste ganho: %.2f" % y)
  print("Em percentual: 12 %")
elif a >= 800.01 and a <= 1200.00:
  y = 0.1 * a
  a = y + a
  print("Novo salario: %.2f" % a)
  print("Reajuste ganho: %.2f" % y)
  print("Em percentual: 10 %")
elif a >= 1200.01 and a <= 2000.00:
  y = 0.07 * a
  a = y + a
  print("Novo salario: %.2f" % a)
  print("Reajuste ganho: %.2f" % y)
  print("Em percentual: 7 %")
elif a > 2000.00: 
  y = 0.04 * a
  a = y + a
  print("Novo salario: %.2f" % a)
  print("Reajuste ganho: %.2f" % y)
  print("Em percentual: 4 %")


