@Test
    public void testCloning() {
        OHLCDataItem i1 = new OHLCDataItem(
            new Date(1L), 1.0, 2.0, 3.0, 4.0, 5.0
        );
        assertFalse(i1 instanceof Cloneable);
    }

    