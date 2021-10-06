@Test
    public void testAddValue() {
        DefaultMultiValueCategoryDataset d1
                = new DefaultMultiValueCategoryDataset();

        boolean pass = false;
        try {
            d1.add(null, "R1", "C1");
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        List<Number> values = new ArrayList<>();
        d1.add(values, "R2", "C1");
        assertEquals(values, d1.getValues("R2", "C1"));

        pass = false;
        try {
            d1.add(values, null, "C2");
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    