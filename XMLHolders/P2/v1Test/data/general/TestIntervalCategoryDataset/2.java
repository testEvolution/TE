@Override
    public Number getValue(int row, int column) {
        IntervalDataItem item = (IntervalDataItem) this.data.getObject(row,
                column);
        if (item == null) {
            return null;
        }
        return item.getValue();
    }

    