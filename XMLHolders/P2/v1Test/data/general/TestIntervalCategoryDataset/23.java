@Override
    public Number getEndValue(int series, int category) {
        IntervalDataItem item = (IntervalDataItem) this.data.getObject(series,
                category);
        if (item == null) {
            return null;
        }
        return item.getUpperBound();
    }

    