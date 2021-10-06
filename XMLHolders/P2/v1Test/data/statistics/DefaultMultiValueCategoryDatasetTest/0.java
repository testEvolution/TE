@Test
    public void testGetValue() {
        DefaultMultiValueCategoryDataset d
                = new DefaultMultiValueCategoryDataset();
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        d.add(values, "R1", "C1");
        assertEquals(1.5, d.getValue("R1", "C1"));
        boolean pass = false;
        try {
            d.getValue("XX", "C1");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);

        pass = false;
        try {
            d.getValue("R1", "XX");
        }
        catch (UnknownKeyException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    