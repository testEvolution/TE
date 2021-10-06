@Test
    public void testHashCode() {
        DateTickMarkPosition a1 = DateTickMarkPosition.END;
        DateTickMarkPosition a2 = DateTickMarkPosition.END;
        assertTrue(a1.equals(a2));
        int h1 = a1.hashCode();
        int h2 = a2.hashCode();
        assertEquals(h1, h2);
    }

    