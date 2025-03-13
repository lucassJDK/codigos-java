package com.mycompany.app;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
    public class Fato{
        private String fact;
        private String length;

        public String getFact() {
            return fact;
        }

        public void setFato(String fact) {
            this.fact = fact;
        }

        public String getLength() {
            return length;
        }

        public void setLength(String length) {
            this.length = length;
        }
    }