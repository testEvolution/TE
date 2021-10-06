@Test
    public void testGetValue2() {
        DefaultMultiValueCategoryDataset d
                = new DefaultMultiValueCategoryDataset();
        boolean pass = false;
        try {
            /* Number n =*/ d.getValue(0, 0);
        }
        catch (IndexOutOfBoundsException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    