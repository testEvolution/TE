@Test
    public void testSerialization() {
        DefaultKeyedValues2D kv2D1 = new DefaultKeyedValues2D();
        kv2D1.addValue(234.2, "Row1", "Col1");
        kv2D1.addValue(null, "Row1", "Col2");
        kv2D1.addValue(345.9, "Row2", "Col1");
        kv2D1.addValue(452.7, "Row2", "Col2");

        DefaultKeyedValues2D kv2D2 = (DefaultKeyedValues2D) 
                TestUtils.serialised(kv2D1);
        assertEquals(kv2D1, kv2D2);
    }

    