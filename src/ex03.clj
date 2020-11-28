(ns ex03)

(def N 600851475143)

(defn divisible [n x]
  (zero? (rem n x)))

(defn largest-factor [x]
  (loop [i 2
         last-found 1
         x x]
    (if (= x 1)
      last-found
      (if (divisible x i)
        (recur i i (/ x i))
        (recur (inc i) last-found x)))))

(largest-factor N)