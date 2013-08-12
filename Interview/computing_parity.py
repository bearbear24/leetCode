def ComputeParity(num):
  result = 0
  while num > 0:
    if num & 1 == 1:
      result += 1
    num = num >> 1
  return result

if __name__ ==  '__main__':
  print ComputeParity(2)
  print ComputeParity(32)
  print ComputeParity(31)
  print ComputeParity(65)

