@Override
    public Number getStartValue(Comparable series, Comparable category) {
        IntervalDataItem item = (IntervalDataItem) this.data.getObject(series,
                category);
        if (item == null) {
            return null;
        }
        return item.getLowerBound();
    }

    