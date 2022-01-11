module Rama where

  cubesum n = [(i,j) | i <- [1..n**(1/3)], j <- [1..n**(1/3)], i*i*i+j*j*j==n, i<j]
  rama = head [ n | n <-[1,2..], length (cubesum n) >= 2]
