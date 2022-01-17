module ZahlenFolge where


  zahlenFolge ::  [Int]
  zahlenFolge = [n | n <- [1,2..], mod n 5 == 0 || mod n 7 == 0 || mod n 9 == 0]


  zahlenFolgeExtended :: [Int] -> [Int]
  zahlenFolgeExtended x = [n | n <- [1,2..], inFolge n x]

  inFolge :: Int -> [Int] -> Bool
  inFolge n (x:xs) = mod n x == 0 || inFolge n xs
  inFolge n [] = False
