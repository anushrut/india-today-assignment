package com.indiatoday.test.project.homescreen.service;

import com.indiatoday.test.project.homescreen.dto.QuestionDTO;
import com.indiatoday.test.project.homescreen.entity.Questions;
import com.indiatoday.test.project.homescreen.entity.Suggestions;
import com.indiatoday.test.project.homescreen.repository.QuestionsRepository;
import com.indiatoday.test.project.homescreen.repository.SuggestionsRepository;
import com.indiatoday.test.project.homescreen.response.QuestionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {
    @Autowired
    QuestionsRepository questionsRepository;

    @Autowired
    SuggestionsRepository suggestionsRepository;

    public QuestionResponse getData() {
        List<Questions> questionsList = questionsRepository.findAll();
        List<QuestionDTO> questionDTOList = new ArrayList<>();

        for (Questions question : questionsList) {
            List<Suggestions> suggestionsList = suggestionsRepository.findByQuestionsId(question.getId());
            List<String> suggestions = suggestionsList.stream().map(e -> e.getQuestion()).collect(Collectors.toList());
            QuestionDTO questionDTO = QuestionDTO.builder()
                    .id(question.getId())
                    .name(question.getName())
                    .description(question.getDescription())
                    .price(question.getPrice())
                    .suggestions(suggestions)
                    .build();
            questionDTOList.add(questionDTO);
        }
        QuestionResponse questionResponse = QuestionResponse.builder()
                .httpStatus("OK")
                .httpStatusCode(200)
                .success(true)
                .message("Question categories fetched successfully.")
                .apiName("Get all services.")
                .data(questionDTOList)
                .build();

        return questionResponse;
    }
}
