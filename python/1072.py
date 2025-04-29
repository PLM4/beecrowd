n = int(input())
contIn = 0
contOut = 0
for i in range(n):
  x = int(input())
  if  10 <= x <=20:
    contIn += 1
  elif x < 0:
    continue
  else:
    contOut += 1

print(f"{contIn} in")
print(f"{contOut} out")