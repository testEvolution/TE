@Test
    public void testConstructor1() {
        ComparableObjectSeries s1 = new ComparableObjectSeries("s1");
        assertEquals("s1", s1.getKey());
        assertNull(s1.getDescription());
        assertTrue(s1.getAllowDuplicateXValues());
        assertTrue(s1.getAutoSort());
        assertEquals(0, s1.getItemCount());
        assertEquals(Integer.MAX_VALUE, s1.getMaximumItemCount());

        // try null key
        boolean pass = false;
        try {
            /*s1 = */new ComparableObjectSeries(null);
        }
        catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);
    }

    