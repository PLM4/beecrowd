n1, n2, n3 = input().split()
n1 = int(n1)
n2 = int(n2)
n3 = int(n3)

if n3 > n1 < n2:
  print(n1)
  if n2 < n3:
    print(n2)
    print(n3)
  else:
    print(n3)
    print(n2)
if n1 > n2 < n3:
  print(n2)
  if n1 < n3:
    print(n1)
    print(n3)
  else:
    print(n3)
    print(n1)
if n1 > n3 < n2:
  print(n3)
  if n1 < n2:
    print(n1)
    print(n2)
  else:
    print(n2)
    print(n1)

print()

print(n1)
print(n2)
print(n3)
