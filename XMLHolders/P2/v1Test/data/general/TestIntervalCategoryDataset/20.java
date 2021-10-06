@Override
    public Object clone() throws CloneNotSupportedException {
        TestIntervalCategoryDataset clone = (TestIntervalCategoryDataset)
                super.clone();
        clone.data = (KeyedObjects2D) this.data.clone();
        return clone;
    }

    