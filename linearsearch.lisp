
(defun linearsearch ()
  (setq list (listinp))
  (setq item (iteminp))
  (loop for pos from 0 and element in list
        when (eql item element)
          do (return pos)
          )
  )

(defun listinp ()
  (princ "Enter list:")
  (setq list (read-from-string (concatenate 'string "(" (read-line) ")")))
  (return-from listinp list)
  )
  

(defun iteminp ()
  (princ "Enter item to search: ")
  (setq item (read))
  (return-from iteminp item)
  )

(write (linearsearch))