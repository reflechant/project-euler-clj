(ns ex02)

(defn fibonacci
  ([]  (fibonacci 0 1))
  ([a b] (lazy-seq (cons a (fibonacci b (+ a b))))))

(->> (fibonacci)
     (take-while (partial > 4000000))
     (filter even?)
     (reduce +))