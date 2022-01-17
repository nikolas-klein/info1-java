module PrimzahlFolge where

  primzahlFolge :: [Int]
  primzahlFolge = [n | n<- [2..], isPrime n]

  isPrim :: Int -> Bool
  isPrim k = null [ x | x <- [2..k - 1], k `mod` x == 0]
