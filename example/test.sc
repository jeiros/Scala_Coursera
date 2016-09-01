def sum(xs: List[Int]): Int =
  if (xs.isEmpty) 0 else xs.head + sum(xs.tail)

sum(List(1,2,3))



def max(xs: List[Int]): Int = {
  if (xs.isEmpty) {
    throw java.util.NoSuchElementException
  } else max(xs)
  if (xs.head > max(xs.tail)) xs.head
  else max(xs.tail)
}





