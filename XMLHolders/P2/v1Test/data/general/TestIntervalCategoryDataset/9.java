@Override
    public Number getValue(Comparable rowKey, Comparable columnKey) {
        IntervalDataItem item = (IntervalDataItem) this.data.getObject(rowKey,
                columnKey);
        if (item == null) {
            return null;
        }
        return item.getValue();
    }

    