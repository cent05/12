# -*- coding: utf-8 -*-
"""
Created on Mon Dec 21 13:59:18 2020

@author: dell
"""
import pandas as pd

cat_data = ["cat", "dog", "bird","reptile","cat","dog"]
num_data, meta_data = pd.factorize(cat_data)
print(num_data)
print(meta_data)
