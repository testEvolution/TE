@Test
    public void testSerialization() {
        KeyedObjects2D ko2D1 = new KeyedObjects2D();
        ko2D1.addObject(234.2, "Row1", "Col1");
        ko2D1.addObject(null, "Row1", "Col2");
        ko2D1.addObject(345.9, "Row2", "Col1");
        ko2D1.addObject(452.7, "Row2", "Col2");

        KeyedObjects2D ko2D2 = (KeyedObjects2D) TestUtils.serialised(ko2D1);
        assertEquals(ko2D1, ko2D2);
    }

    