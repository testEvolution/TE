public void removeRow(Comparable rowKey) {
        this.data.removeRow(rowKey);
        fireDatasetChanged();
    }

    